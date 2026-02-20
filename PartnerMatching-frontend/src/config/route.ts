import Index from "../pages/Index.vue";
import Search from "../pages/SearchPage.vue";
import Team from "../pages/TeamPage.vue";
import UserEditPage from "../pages/UserEditPage.vue";
import SearchResultPage from "../pages/SearchResultPage.vue";
import UserLoginPage from "../pages/UserLoginPage.vue";
import TeamAddPage from "../pages/TeamAddPage.vue";
import TeamUpdatePage from "../pages/TeamUpdatePage.vue";
import UserUpdatePage from "../pages/UserUpdatePage.vue";
import UserPage from "../pages/UserPage.vue";
import UserTeamJoin from "../pages/UserTeamJoin.vue";
import UserTeamCreate from "../pages/UserTeamCreate.vue";


const routes = [
    {path: '/', component: Index},
    {path: '/team', component: Team},
    {path: '/team/add', component: TeamAddPage},
    {path: '/team/update', component: TeamUpdatePage},
    {path: '/user', component: UserPage},
    {path: '/search', component: Search},
    {path: '/user/list', component: SearchResultPage},
    {path: '/user/edit', component: UserEditPage},
    {path: '/user/login', component: UserLoginPage},
    {path: '/user/update', component: UserUpdatePage},
    {path: '/user/team/join', component: UserTeamJoin},
    {path: '/user/team/create', component: UserTeamCreate},
]

export default routes;