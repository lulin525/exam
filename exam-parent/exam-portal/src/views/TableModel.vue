<template>
    <el-table :data="tableData" style="width: 100%">
        <el-table-column v-for="" prop="paper_code" label="题型编号">
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
</template>

<script>
    export default {
        name: "TableModel",
        data() {
            return {
                typeName: '新增题目',
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