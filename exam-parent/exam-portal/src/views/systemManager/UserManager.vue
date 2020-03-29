<template>
    <el-tabs v-model="activeName" @tab-click="handleClickTab" style="width: auto">
<!--        <el-tab-pane label="教师管理" name="teacher">教师管理</el-tab-pane>-->
<!--        <el-tab-pane label="学生管理" name="student">学生管理</el-tab-pane>-->
        <!-- 缓存 -->
<!--        <keep-alive>-->
            <el-tab-pane label="教师管理" name="teacher">
                <el-table :data="tableData" style="width: 100%">
                    <el-table-column prop="date" label="日期">
                    </el-table-column>
                    <el-table-column prop="name" label="姓名">
                    </el-table-column>
                    <el-table-column prop="address" label="地址">
                    </el-table-column>
                    <el-table-column fixed="right" label="操作" width="100">
                        <template slot-scope="scope">
                            <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
                            <el-button type="text" size="small">编辑</el-button>
                        </template>
                    </el-table-column>
                </el-table>
            </el-tab-pane>
            <el-tab-pane label="学生管理" name="student">
                <el-table :data="tableData" style="width: 100%">
                    <el-table-column prop="date" label="日期">
                    </el-table-column>
                    <el-table-column prop="name" label="姓名">
                    </el-table-column>
                    <el-table-column prop="address" label="地址">
                    </el-table-column>
                    <el-table-column fixed="right" label="操作" width="100">
                        <template slot-scope="scope">
                            <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
                            <el-button type="text" size="small">编辑</el-button>
                        </template>
                    </el-table-column>
                </el-table>
            </el-tab-pane>
<!--        </keep-alive>-->
    </el-tabs>
</template>
<script>
    export default {
        name: "userManager",
        data() {
            return {
                activeName: 'teacher',
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1517 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1519 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1516 弄'
                }]
            };
        },
        methods: {
            handleClickTab(tab, event) {
                console.log(tab, event);
            },
            handleClick(row) {
                console.log(row);
            }
        }
    };
</script>

<style scoped>

</style>