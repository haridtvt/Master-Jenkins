def call(String API_IMAGE, String WORKER_IMAGE, String WEB_IMAGE){
    sh 'docker push ${API_IMAGE}'
    sh 'docker push ${WORKER_IMAGE}'
    sh 'docker push ${WEB_IMAGE}'
    sh 'docker rmi ${WEB_IMAGE} ${WORKER_IMAGE} ${WEB_IMAGE}'
}