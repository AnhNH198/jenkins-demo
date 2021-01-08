job('NodeJS-demo example'){
    git('https://github.com/wardviaene/docker-demo.git') {
        node ->
        node / gitConfigName('AnhNH198')
        node / gitConfigEmail('AnhNH198@bizfly.academy')
    }
triggers{
    scm('H/6 * * * *')
}
wrappers{
    nodejs('nodejs-7.10')
}
steps{
    shell(npm install)
}
}
