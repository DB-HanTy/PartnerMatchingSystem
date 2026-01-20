import path from "path";
import Index from "../pages/Index.vue";
import Search from "../pages/SearchPage.vue";
import Team from "../pages/TeamPage.vue";
import User from "../pages/UserPage.vue";
import EditUserPage from "../pages/UserEditPage.vue";
import UserEditPage from "../pages/UserEditPage.vue";


const routes = [
    {path: '/', component: Index},
    {path: '/team', component: Team},
    {path: '/user', component: User},
    {path: '/search', component: Search},
    {path: '/user/edit', component: UserEditPage}
]

export default routes;