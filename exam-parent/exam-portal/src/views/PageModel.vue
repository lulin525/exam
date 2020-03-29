<template>
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-header style="text-align: right; font-size: 12px">
                <span>考试管理系统</span>
                <el-avatar icon="el-icon-user-solid"></el-avatar>
        </el-header>
        <el-container>
            <el-aside width="220px" style="background-color: rgb(238, 241, 246)">
                <el-menu router>
                    <el-menu-item index="/">首页</el-menu-item>
                    <el-submenu v-for="(item,index) in $router.options.routes" :key="index" :index="index+1+''" v-if="index>0">
                        <template slot="title">{{item.name}}</template>
                        <el-menu-item v-for="(item2,index2) in item.children" :key="index+'-'+index2" :index="item2.path" :class="$route.path===item2.path?'is-active':''">
                            {{item2.name}}
                        </el-menu-item>
                    </el-submenu>
                </el-menu>
            </el-aside>
            <el-main>
                <router-view/>
            </el-main>
        </el-container>
    </el-container>
</template>

<script>
    export default {
        name: "PageModel"
    }
</script>

<style scoped>
    .el-header {
        background-color: #B3C0D1;
        color: #333;
        line-height: 60px;
    }

    .el-aside {
        color: #333;
    }
</style>