### 構築手順
```
# アプリケーション作成
copilot app init copilot-demo --resource-tags owner=t.tanaka

# Environment作成
copilot env init --name dev --app copilot-demo --default-config

# Service作成
copilot svc init --name api1 --app copilot-demo --dockerfile ./Dockerfile --port 8080 --svc-type "Load Balanced Web Service"
copilot svc init --name api2 --app copilot-demo --dockerfile ./Dockerfile --port 8080 --svc-type "Load Balanced Web Service"

# Javaアプリビルド
gradlew clean build

# devへapiをDeploy
copilot svc deploy --name api1 --env dev
copilot svc deploy --name api2 --env dev
```
### ローカル動作確認
```
# 環境変数APP_NAMEを設定しておくこと(中身は任意)
gradlew clean bootRun
```
http://localhost:8080/sample をブラウザで表示すると`APP_NAME`がHTMLに表示される