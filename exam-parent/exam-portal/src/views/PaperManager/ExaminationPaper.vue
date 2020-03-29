<template>
    <el-tabs v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="未审批" name="first">未审批</el-tab-pane>
        <el-tab-pane label="已审批" name="second">已审批</el-tab-pane>
    </el-tabs>
</template>

<script>
    export default {
        name: "ExaminationPaper",
        data() {
            return {
                activeName: 'second'
            };
        },
        methods: {
            handleClick(tab, event) {
                console.log(tab, event);
            }
        }
    };
</script>

<style scoped>

</style>