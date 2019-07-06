/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ProvenanceEntity of the Data Model fhir.
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
{@link agent}, 

* It provides of then following operations (getters and setters)
{@link getWhat},
{@link getAgent},
{@link setWhat},
{@link setAgent},
 */

@Description("Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.")

public interface ProvenanceEntity extends GenericEntity, fhir.BackboneElement {

	EntityType<ProvenanceEntity> T = EntityTypes.T(ProvenanceEntity.class);

	/* Constants for each property name. */
	java.lang.String what = "what";
	java.lang.String agent = "agent";

	@Description("Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWhat();
	void setWhat(com.braintribe.model.generic.GenericEntity what);
	@Description("The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.")
	
	java.util.List<fhir.ProvenanceAgent> getAgent();
	void setAgent(java.util.List<fhir.ProvenanceAgent> agent);

}
