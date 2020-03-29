<template>
    <div style="margin-left: 20px;">
        <el-row style="margin: 20px 0px 40px 0px">
            <el-button type="primary" round @click="dialogFormVisible = true;addQuestion()">新增题目类型</el-button>
            <!-- 添加题目 -->
            <el-dialog :title="typeName" :visible.sync="dialogFormVisible">
                <el-form :model="form">
                    <!--<el-form-item label="题目编号" :label-width="formLabelWidth">
                        <el-input v-model="form.code" autocomplete="off"></el-input>
                    </el-form-item>-->
                    <el-form-item label="题目类型" :label-width="formLabelWidth">
                        <el-select v-model="form.type" placeholder="请选择题目类型">
                            <el-option label="单项选择题" value="1"></el-option>
                            <el-option label="多项选择题" value="2"></el-option>
                            <el-option label="判断题" value="3"></el-option>
                            <el-option label="填空题" value="4"></el-option>
                            <el-option label="名词解释" value="5"></el-option>
                            <el-option label="简答题" value="6"></el-option>
                        </el-select>
                    </el-form-item>
                    <!-- 所有题目名称 -->
                    <div v-if="form.type">
                        <el-form-item label="题目名称" :label-width="formLabelWidth">
                            <el-input v-model="form.name" autocomplete="off" style="width: 80%"></el-input>
                        </el-form-item>
                    </div>
                    <!-- 单项选择题，多项选择题(题目选项都为文本框) -->
                    <div v-if="form.type=='1' || form.type=='2'">
                        <el-form-item label="题目选项" :label-width="formLabelWidth">
                            <el-input v-model="form.singleOption" autocomplete="off" style="width: 60%"></el-input>
                            <el-input v-model="form.singleOption" autocomplete="off" style="width: 60%"></el-input>
                            <el-input v-model="form.singleOption" autocomplete="off" style="width: 60%"></el-input>
                            <el-input v-model="form.singleOption" autocomplete="off" style="width: 60%"></el-input>
                        </el-form-item>
                    </div>
                    <!-- 单项选择题(单选框) -->
                    <div v-if="form.type=='1'">
                        <el-form-item label="题目答案" :label-width="formLabelWidth">
                            <el-radio v-model="form.singleAnswer" label="A"></el-radio>
                            <el-radio v-model="form.singleAnswer" label="B"></el-radio>
                            <el-radio v-model="form.singleAnswer" label="C"></el-radio>
                            <el-radio v-model="form.singleAnswer" label="D"></el-radio>
                        </el-form-item>
                    </div>
                    <!-- 多项选择题(多选框) -->
                    <div v-if="form.type=='2'">
                        <el-form-item label="题目答案" :label-width="formLabelWidth">
                            <el-checkbox-group v-model="form.multiAnswerList">
                                <el-checkbox label="复选框 A"></el-checkbox>
                                <el-checkbox label="复选框 B"></el-checkbox>
                                <el-checkbox label="复选框 C"></el-checkbox>
                                <el-checkbox label="复选框 D"></el-checkbox>
                            </el-checkbox-group>
                        </el-form-item>
                    </div>
                    <!-- 判断题(单选框) -->
                    <div v-if="form.type=='3'">
                        <el-form-item label="题目答案" :label-width="formLabelWidth">
                            <el-radio v-model="form.opinionAnswer" label="0">√</el-radio>
                            <el-radio v-model="form.opinionAnswer" label="1">×</el-radio>
                        </el-form-item>
                    </div>
                    <!-- 填空题，名词解释，简答题(文本框) -->
                    <div v-if="form.type>3">
                        <el-form-item label="题目答案" :label-width="formLabelWidth">
                            <el-input type="textarea" :autosize="{ minRows: 3, maxRows: 6}" :placeholder="form.type==4?'填空题答案请使用空格隔开':'请输入内容'" v-model="form.textAnswer" style="width: 80%">
                            </el-input>
                        </el-form-item>
                    </div>
                </el-form>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialogFormVisible = false">取 消</el-button>
                    <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
                </div>
            </el-dialog>
        </el-row>
        <keep-alive>
            <el-tabs v-model="activeName" @tab-click="handleClick" style="align-content: center;width: 100%">
                <el-tab-pane label="单项选择题" name="first">
                    <table-model/>
                </el-tab-pane>
                <el-tab-pane label="多项选择题" name="second">
                    <table-model/>
                </el-tab-pane>
                <el-tab-pane label="判断题" name="third">
                    <table-model/>
                </el-tab-pane>
                <el-tab-pane label="填空题" name="fourth">
                    <table-model/>
                </el-tab-pane>
                <el-tab-pane label="名词解释" name="fifth">
                    <table-model/>
                </el-tab-pane>
                <el-tab-pane label="简答题" name="sixth">
                    <table-model/>
                </el-tab-pane>
            </el-tabs>
        </keep-alive>
    </div>
</template>
<script>
    import {AxiosInstance as axios} from "axios";
    import TableModel from '../TableModel'
    export default {
        name: "QuestionManager",
        //注册局部组件
        components:{
            TableModel
        },
        props: ['tableAttribute'],
        data() {
            return {
                typeName: '新增题目',
                activeName: 'second',
                dialogTableVisible: false,
                dialogFormVisible: false,
                single_answer: [],
                form: {
                    name: '',
                    type: '',
                    singleOption: '',
                    singleAnswer: '',
                    multiAnswerList: [],
                    opinionAnswer: '',
                    textAnswer: ''
                },
                formLabelWidth: '120px'
            };
        },
        created(){
            // alert("1");
          /*axios.get("url").then(function (response) {
              
          })*/
        },
        methods: {
            handleClick(tab, event) {
                //根据不同的试题类型显示不同页面
                //发送ajax获取数据
                console.log(tab, event);
            },
            addQuestion(){
                this.typeName = '新增题目';
            },
            editQuestion(){
                this.typeName = '编辑题目';
            },deleteRow(index, rows) {
                rows.splice(index, 1);
            },
            editRow(index, rows) {
                this.typeName = '修改题型'
            },
            addPaperType(){
                this.typeName = '新增题型'
            }
        }
    };
</script>


<style scoped>

</style>