import Vue from 'vue'
import axios from 'axios'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import PageModel from "./views/PageModel";

Vue.use(ElementUI)
Vue.config.productionTip = false
Vue.component('page-model',PageModel)
new Vue({
  el: '#app',
  router,
  render: h => h(App)
}).$mount('#app')

/*new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})*/
