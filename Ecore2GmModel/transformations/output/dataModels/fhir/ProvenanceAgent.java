/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ProvenanceAgent of the Data Model fhir.
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
{@link onBehalfOf}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getRole},
{@link getWho},
{@link getOnBehalfOf},
{@link setType},
{@link setRole},
{@link setWho},
{@link setOnBehalfOf},
 */

@Description("Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.")

public interface ProvenanceAgent extends GenericEntity, fhir.BackboneElement {

	EntityType<ProvenanceAgent> T = EntityTypes.T(ProvenanceAgent.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String role = "role";
	java.lang.String who = "who";
	java.lang.String onBehalfOf = "onBehalfOf";

	@Description("The participation the agent had with respect to the activity.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity.")
	
	java.util.List<fhir.CodeableConcept> getRole();
	void setRole(java.util.List<fhir.CodeableConcept> role);

	@Description("The individual, device or organization that participated in the event.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWho();
	void setWho(com.braintribe.model.generic.GenericEntity who);
	@Description("The individual, device, or organization for whom the change was made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOnBehalfOf();
	void setOnBehalfOf(com.braintribe.model.generic.GenericEntity onBehalfOf);
}
