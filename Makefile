.DEFAULT_GOAL := help

push: ## push change to github
	@git add .
	@git commit -m "pii bear write code on `date +%Y-%m-%d`"
	@git push origin master

stop: ## stop all services
	@docker-compose down
shell: ## enter in to linebrarian container to dosomething
	@docker-compose exec linebrarian bash
ps: ## show containers status
	@docker-compose ps
##@ Other
help: ## Print this help
	@awk 'BEGIN {FS = ":.*##"; printf "Usage: make \033[36m<target>\033[0m\n"} /^[a-zA-Z_-]+:.*?##/ { printf "  \033[36m%-20s\033[0m %s\n", $$1, $$2 } /^##@/ { printf "\n\033[31m%s\033[0m\n", substr($$0, 5) } ' $(MAKEFILE_LIST)
