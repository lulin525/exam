import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from "../views/Index";
import SystemManager from "../views/systemManager/SystemManager";
import MenuManager from "../views/systemManager/MenuManager";
import RoleManager from "../views/systemManager/RoleManager";
import UserManager from "../views/systemManager/UserManager";
import PaperManager from "../views/PaperManager/PaperManager";
import PaperTypeManager from "../views/PaperManager/PaperTypeManager";
import QuestionManager from "../views/PaperManager/QuestionManager";
import PublishPaper from "../views/PaperManager/PublishPaper";
import DisciplineManager from "../views/DisciplineManager/DisciplineManager";
import DisciplineTypeManager from "../views/DisciplineManager/DisciplineTypeManager";
import ChapterManager from "../views/DisciplineManager/ChapterManager";
import GradeManager from "../views/GradeManager/GradeManager";
import StudentGrade from "../views/GradeManager/StudentGrade";
import GradeTotal from "../views/GradeManager/GradeTotal";
import GradeAnalysis from "../views/GradeManager/GradeAnalysis";
import ClassManager from "../views/systemManager/ClassManager";
import SuiteManager from "../views/PaperManager/SuiteManager";
import ExaminationPaper from "../views/PaperManager/ExaminationPaper";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: '首页',
    component: Index/*,
    redirect: '/paperTypeManager'*/
  },
  {
    path: '/disciplineManager',
    name: '学科管理',
    component: DisciplineManager,
    children:[
      {
        path: '/disciplineTypeManager',
        name: '类型管理',
        component:DisciplineTypeManager
      },
      {
        path: '/chapterManager',
        name: '章节管理',
        component:ChapterManager
      }
    ]
  },
  {
    path: '/paper',
    name: '试卷管理',
    component: PaperManager,
    children:[
      {
        path: '/paperTypeManager',
        name: '题型管理',
        component:PaperTypeManager
      },
      {
        path: '/questionManager',
        name: '试题管理',
        component:QuestionManager
      },
      {
        path: '/suiteManager',
        name: '套题管理',
        component:SuiteManager
      },
      {
        path: '/publishPaper',
        name: '试卷发布',
        component:PublishPaper
      },
      {
        path: '/examinationPaper',
        name: '审批试卷',
        component:ExaminationPaper
      }
    ]
  },
  {
    path: '/gradeManager',
    name: '成绩管理',
    component: GradeManager,
    children:[
      {
        path: '/studentGrade',
        name: '学生成绩',
        component:StudentGrade
      },
      {
        path: '/gradeTotal',
        name: '成绩统计',
        component:GradeTotal
      },
      {
        path: '/gradeAnalysis',
        name: '成绩分析',
        component:GradeAnalysis
      }
    ]
  },
  {
    path: '/system',
    name: '系统管理',
    component: SystemManager,
    children:[
      {
        path: '/userManager',
        name: '用户管理',
        component:UserManager
      },
      {
        path: '/roleManager',
        name: '角色管理',
        component:RoleManager
      },
      {
        path: '/menuManager',
        name: '菜单管理',
        component:MenuManager
      },
      {
        path: '/classManager',
        name: '班级管理',
        component:ClassManager
      }
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  routes: routes
})

export default router

