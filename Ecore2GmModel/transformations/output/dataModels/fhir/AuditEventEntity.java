/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AuditEventEntity of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link what}, 
{@link type}, 
{@link role}, 
{@link lifecycle}, 
{@link securityLabel}, 
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getWhat},
{@link getType},
{@link getRole},
{@link getLifecycle},
{@link getSecurityLabel},
{@link getDetail},
{@link setWhat},
{@link setType},
{@link setRole},
{@link setLifecycle},
{@link setSecurityLabel},
{@link setDetail},
 */

@Description("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.")

public interface AuditEventEntity extends GenericEntity, fhir.BackboneElement {

	EntityType<AuditEventEntity> T = EntityTypes.T(AuditEventEntity.class);

	/* Constants for each property name. */
	java.lang.String what = "what";
	java.lang.String type = "type";
	java.lang.String role = "role";
	java.lang.String lifecycle = "lifecycle";
	java.lang.String securityLabel = "securityLabel";
	java.lang.String detail = "detail";

	@Description("Identifies a specific instance of the entity. The reference should be version specific.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWhat();
	void setWhat(com.braintribe.model.generic.GenericEntity what);
	@Description("The type of the object that was involved in this audit event.")
	@Mandatory
	fhir.Coding getType();
	void setType(fhir.Coding type);
	@Description("Code representing the role the entity played in the event being audited.")
	@Mandatory
	fhir.Coding getRole();
	void setRole(fhir.Coding role);
	@Description("Identifier for the data life-cycle stage for the entity.")
	@Mandatory
	fhir.Coding getLifecycle();
	void setLifecycle(fhir.Coding lifecycle);
	@Description("Security labels for the identified entity.")
	
	java.util.List<fhir.Coding> getSecurityLabel();
	void setSecurityLabel(java.util.List<fhir.Coding> securityLabel);

	@Description("Tagged value pairs for conveying additional information about the entity.")
	
	java.util.List<fhir.AuditEventDetail> getDetail();
	void setDetail(java.util.List<fhir.AuditEventDetail> detail);

}
