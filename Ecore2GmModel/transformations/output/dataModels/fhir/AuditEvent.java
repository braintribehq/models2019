/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AuditEvent of the Data Model fhir.
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
{@link type}, 
{@link subtype}, 
{@link period}, 
{@link purposeOfEvent}, 
{@link agent}, 
{@link source}, 
{@link entity}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getSubtype},
{@link getPeriod},
{@link getPurposeOfEvent},
{@link getAgent},
{@link getSource},
{@link getEntity},
{@link setType},
{@link setSubtype},
{@link setPeriod},
{@link setPurposeOfEvent},
{@link setAgent},
{@link setSource},
{@link setEntity},
 */

@Description("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.If the element is present, it must have either a @value, an @id, or extensions")

public interface AuditEvent extends GenericEntity, fhir.FhirDomainResource {

	EntityType<AuditEvent> T = EntityTypes.T(AuditEvent.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String subtype = "subtype";
	java.lang.String period = "period";
	java.lang.String purposeOfEvent = "purposeOfEvent";
	java.lang.String agent = "agent";
	java.lang.String source = "source";
	java.lang.String entity = "entity";

	@Description("Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.")
	@Mandatory
	fhir.Coding getType();
	void setType(fhir.Coding type);
	@Description("Identifier for the category of event.")
	
	java.util.List<fhir.Coding> getSubtype();
	void setSubtype(java.util.List<fhir.Coding> subtype);

	@Description("The period during which the activity occurred.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The purposeOfUse (reason) that was used during the event being recorded.")
	
	java.util.List<fhir.CodeableConcept> getPurposeOfEvent();
	void setPurposeOfEvent(java.util.List<fhir.CodeableConcept> purposeOfEvent);

	@Description("An actor taking an active role in the event or activity that is logged.")
	
	java.util.List<fhir.AuditEventAgent> getAgent();
	void setAgent(java.util.List<fhir.AuditEventAgent> agent);

	@Description("The system that is reporting the event.")
	@Mandatory
	fhir.AuditEventSource getSource();
	void setSource(fhir.AuditEventSource source);
	@Description("Specific instances of data or objects that have been accessed.")
	
	java.util.List<fhir.AuditEventEntity> getEntity();
	void setEntity(java.util.List<fhir.AuditEventEntity> entity);

}
