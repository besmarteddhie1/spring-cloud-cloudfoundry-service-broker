package contracts

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'GET'
		url '/v2/catalog'
//		body([
//			   "some.id": $(regex('[0-9]{10}')),
//			   someValue: 99999
//		])
		headers {
			contentType('application/json')
		}
	}
	response {
		status 200
//		body([
//			   someStatus  : "IMASTATUS",
//			   "some.reason": "Something happened"
//		])
		headers {
			contentType('application/json')
		}
	}
}