<template>
    <el-tabs v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="生成试卷" name="first">生成试卷</el-tab-pane>
        <el-tab-pane label="试卷发布" name="second">试卷发布</el-tab-pane>
    </el-tabs>
</template>
<script>
    export default {
        name: "PublishPaper",
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