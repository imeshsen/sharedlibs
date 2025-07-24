// vars/envConfig.groovy

def call(String env) {
    def config = [:]

    switch (env.toLowerCase()) {
        case 'dev':
            config.aceEndpointUrl = "http://dev-ace-host:7800/myApi/v1"
            config.aceQueueManager = "DEVQM"
            config.aceJdbcDsName = "DEV_DB_DS"
            config.aceHttpListenPort = "7800"
            // Add other dev-specific properties
            break
        case 'test':
            config.aceEndpointUrl = "http://test-ace-host:7801/myApi/v1"
            config.aceQueueManager = "TESTQM"
            config.aceJdbcDsName = "TEST_DB_DS"
            config.aceHttpListenPort = "7801"
            // Add other test-specific properties
            break
        case 'prod':
            config.aceEndpointUrl = "https://prod-ace-host:7802/myApi/v1" // HTTPS for prod
            config.aceQueueManager = "PRODQM"
            config.aceJdbcDsName = "PROD_DB_DS"
            config.aceHttpListenPort = "7802"
            // Add other prod-specific properties
            break
        default:
            error "Unknown environment: ${env}. Please specify 'dev', 'test', or 'prod'."
    }

    return config
}
