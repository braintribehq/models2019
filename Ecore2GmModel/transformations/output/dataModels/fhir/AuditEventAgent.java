/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AuditEventAgent of the Data Model fhir.
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
{@link role}, 
{@link who}, 
{@link location}, 
{@link media}, 
{@link network}, 
{@link purposeOfUse}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getRole},
{@link getWho},
{@link getLocation},
{@link getMedia},
{@link getNetwork},
{@link getPurposeOfUse},
{@link setType},
{@link setRole},
{@link setWho},
{@link setLocation},
{@link setMedia},
{@link setNetwork},
{@link setPurposeOfUse},
 */

@Description("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.")

public interface AuditEventAgent extends GenericEntity, fhir.BackboneElement {

	EntityType<AuditEventAgent> T = EntityTypes.T(AuditEventAgent.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String role = "role";
	java.lang.String who = "who";
	java.lang.String location = "location";
	java.lang.String media = "media";
	java.lang.String network = "network";
	java.lang.String purposeOfUse = "purposeOfUse";

	@Description("Specification of the participation type the user plays when performing the event.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.")
	
	java.util.List<fhir.CodeableConcept> getRole();
	void setRole(java.util.List<fhir.CodeableConcept> role);

	@Description("Reference to who this agent is that was involved in the event.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWho();
	void setWho(com.braintribe.model.generic.GenericEntity who);
	@Description("Where the event occurred.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Type of media involved. Used when the event is about exporting/importing onto media.")
	@Mandatory
	fhir.Coding getMedia();
	void setMedia(fhir.Coding media);
	@Description("Logical network location for application activity, if the activity has a network location.")
	@Mandatory
	fhir.AuditEventNetwork getNetwork();
	void setNetwork(fhir.AuditEventNetwork network);
	@Description("The reason (purpose of use), specific to this agent, that was used during the event being recorded.")
	
	java.util.List<fhir.CodeableConcept> getPurposeOfUse();
	void setPurposeOfUse(java.util.List<fhir.CodeableConcept> purposeOfUse);

}
