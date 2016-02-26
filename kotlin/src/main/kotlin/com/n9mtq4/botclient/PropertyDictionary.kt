@file:JvmName("PropertyDictionary")
package com.n9mtq4.botclient

/**
 * Contains dictionary keys for client settings.
 * 
 * This file contains dictionary keys. These can
 * be changed by calling:
 * ```kotlin
 * System.setProperties(PropertyDictionary.SOMETHING, "value")
 * ```
 * 
 * Created by will on 2/1/16 at 8:54 PM.
 * 
 * @author Will "n9Mtq4" Bresnahan
 */
object PropertyDictionary {
	
	/**
	 * The key of the server compliance level
	 * */
	val COMPLIANCE_LEVEL = "botclient.compliance"
	/**
	 * The key of the server's port
	 * */
	val SERVER_PORT = "botclient.serverport"
	
}