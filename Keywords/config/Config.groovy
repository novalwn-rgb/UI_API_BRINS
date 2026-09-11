package config

import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable

class Config {

	static String BASE_URL = "https://dev-brisurf.brins.co.id/BRISURF/CoveringValidation"

	static int TIMEOUT = 30000

	static Map HEADERS = [
		"Content-Type": "application/json"
	]
}