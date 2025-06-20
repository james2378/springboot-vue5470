const base = {
    get() {
        return {
            url : "http://localhost:8080/xueshengcaoxingpingfenxitong/",
            name: "xueshengcaoxingpingfenxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xueshengcaoxingpingfenxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生操行评分系统"
        } 
    }
}
export default base
