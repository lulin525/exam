<template>
    <div style="margin-left: 20px">
        <el-row style="margin: 20px 0px 40px 0px">
<!--            <el-button type="primary" round @click="addPaperType">新增题目类型</el-button>-->
            <!-- 添加题型 -->
            <el-button type="primary" round @click="dialogFormVisible = true;addPaperType()">新增题目类型</el-button>
            <el-dialog :title="typeName" :visible.sync="dialogFormVisible">
                <el-form :model="form">
                    <!--<el-form-item label="题型编号" :label-width="formLabelWidth">
                        <el-input v-model="form.name" autocomplete="off"></el-input>
                    </el-form-item>-->
                    <!--<el-form-item label="题型名称" :label-width="formLabelWidth">
                        <el-input v-model="form.name" autocomplete="off"></el-input>
                    </el-form-item>-->
                    <el-form-item label="题型名称" :label-width="formLabelWidth">
                        <el-select v-model="form.type" placeholder="请选择题目类型">
                            <el-option label="单项选择题" value="1"></el-option>
                            <el-option label="多项选择题" value="2"></el-option>
                            <el-option label="判断题" value="3"></el-option>
                            <el-option label="填空题" value="4"></el-option>
                            <el-option label="名词解释" value="5"></el-option>
                            <el-option label="简答题" value="6"></el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="分数" :label-width="formLabelWidth">
                        <el-input v-model="form.name" autocomplete="off" style="width: 100px"></el-input>
                    </el-form-item>
                </el-form>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialogFormVisible = false">取 消</el-button>
                    <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
                </div>
            </el-dialog>
        </el-row>
        <el-table :data="tableData" style="width: 100%">
            <el-table-column prop="paper_code" label="题型编号">
            </el-table-column>
            <el-table-column prop="name" label="题型名称">
            </el-table-column>
            <el-table-column prop="score" label="分数">
            </el-table-column>
            <el-table-column fixed="right" label="操作" width="220">
                <template slot-scope="scope">
                    <el-button @click.native.prevent="editRow(scope.$index, tableData);dialogFormVisible = true" type="primary" size="small">
                        编辑
                    </el-button>
                    <el-button @click.native.prevent="deleteRow(scope.$index, tableData)" type="primary" size="small">
                        删除
                    </el-button>
                </template>
            </el-table-column>
        </el-table>
        <el-pagination
                small
                layout="prev, pager, next"
                :total="50">
        </el-pagination>
    </div>
</template>
<script>
    export default {
        name: "PaperTypeManager",
        data() {
            return {
                // activeName: 'option1',
                typeName: '新增题型',
                tableData: [{
                    paper_code: 'C00001',
                    name: '单项选择题',
                    score: '2'
                }, {
                    paper_code: 'C00002',
                    name: '多项选择题',
                    score: '3'
                }, {
                    paper_code: 'C00003',
                    name: '填空题',
                    score: '1'
                }],
                dialogTableVisible: false,
                dialogFormVisible: false,
                form: {
                    name: '',
                    type: []
                },
                formLabelWidth: '80px'
            }
        },
        methods:{
            deleteRow(index, rows) {
                rows.splice(index, 1);
            },
            editRow(index, rows) {
                this.typeName = '修改题型'
            },
            addPaperType(){
                this.typeName = '新增题型'
            }
        }
    }
</script>
<style scoped>
    el-table-column{
        align-content: center;
    }
</style>