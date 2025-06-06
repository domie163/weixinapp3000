const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmt05hb/",
            name: "ssmt05hb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmt05hb/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于大学生社团活动管理的微信小程序"
        } 
    }
}
export default base
