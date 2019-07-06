/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AuditEventSource of the Data Model fhir.
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
{@link observer}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getObserver},
{@link getType},
{@link setObserver},
{@link setType},
 */

@Description("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.")

public interface AuditEventSource extends GenericEntity, fhir.BackboneElement {

	EntityType<AuditEventSource> T = EntityTypes.T(AuditEventSource.class);

	/* Constants for each property name. */
	java.lang.String observer = "observer";
	java.lang.String type = "type";

	@Description("Identifier of the source where the event was detected.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getObserver();
	void setObserver(com.braintribe.model.generic.GenericEntity observer);
	@Description("Code specifying the type of source where event originated.")
	
	java.util.List<fhir.Coding> getType();
	void setType(java.util.List<fhir.Coding> type);

}
