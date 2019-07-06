/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Enumeration Type IssueType.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/


package fhir;

import com.braintribe.model.generic.annotation.*;


public enum IssueType {

	INVALID, // invalid
	STRUCTURE, // structure
	REQUIRED, // required
	VALUE, // value
	INVARIANT, // invariant
	SECURITY, // security
	LOGIN, // login
	UNKNOWN, // unknown
	EXPIRED, // expired
	FORBIDDEN, // forbidden
	SUPPRESSED, // suppressed
	PROCESSING, // processing
	NOTSUPPORTED, // not-supported
	DUPLICATE, // duplicate
	MULTIPLEMATCHES, // multiple-matches
	NOTFOUND, // not-found
	DELETED, // deleted
	TOOLONG, // too-long
	CODEINVALID, // code-invalid
	EXTENSION, // extension
	TOOCOSTLY, // too-costly
	BUSINESSRULE, // business-rule
	CONFLICT, // conflict
	TRANSIENT, // transient
	LOCKERROR, // lock-error
	NOSTORE, // no-store
	EXCEPTION, // exception
	TIMEOUT, // timeout
	INCOMPLETE, // incomplete
	THROTTLED, // throttled
	INFORMATIONAL; // informational
}


