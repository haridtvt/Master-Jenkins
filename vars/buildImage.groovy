def call(String API_IMAGE, String WORKER_IMAGE, string WEB_IMAGE) {
    sh "docker build -t ${API_IMAGE} api-gateway/ "
    sh "docker build -t ${WORKER_IMAGE} battle_worker/ "
    sh "docker build -t ${WEB_IMAGE} web-portal/ "
}