def call(String API_IMAGE, String WORKER_IMAGE, string WEB_IMAGE) {
    sh "trivy image --format template --template '@/home/ec2-user/html.tpl' -o report-image-api.html ${API_IMAGE} || true"
    sh "trivy image --format template --template '@/home/ec2-user/html.tpl' -o report-image-worker.html ${WORKER_IMAGE} || true"
    sh "trivy image --format template --template '@/home/ec2-user/html.tpl' -o report-image-web.html ${WEB_IMAGE} || true"
    sh "trivy config  --format template --template '@/home/ec2-user/html.tpl' -o report-image-web.html report-dockerfile.html . || true"
}