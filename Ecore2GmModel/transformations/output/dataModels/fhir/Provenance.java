/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Provenance of the Data Model fhir.
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
{@link target}, 
{@link occurredPeriod}, 
{@link location}, 
{@link reason}, 
{@link activity}, 
{@link agent}, 
{@link entity}, 
{@link signature}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link getOccurredPeriod},
{@link getLocation},
{@link getReason},
{@link getActivity},
{@link getAgent},
{@link getEntity},
{@link getSignature},
{@link setTarget},
{@link setOccurredPeriod},
{@link setLocation},
{@link setReason},
{@link setActivity},
{@link setAgent},
{@link setEntity},
{@link setSignature},
 */

@Description("Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.If the element is present, it must have either a @value, an @id, or extensions")

public interface Provenance extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Provenance> T = EntityTypes.T(Provenance.class);

	/* Constants for each property name. */
	java.lang.String target = "target";
	java.lang.String occurredPeriod = "occurredPeriod";
	java.lang.String location = "location";
	java.lang.String reason = "reason";
	java.lang.String activity = "activity";
	java.lang.String agent = "agent";
	java.lang.String entity = "entity";
	java.lang.String signature = "signature";

	@Description("The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getTarget();
	void setTarget(java.util.List<com.braintribe.model.generic.GenericEntity> target);

	@Description("")
	@Mandatory
	fhir.Period getOccurredPeriod();
	void setOccurredPeriod(fhir.Period occurredPeriod);
	@Description("Where the activity occurred, if relevant.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("The reason that the activity was taking place.")
	
	java.util.List<fhir.CodeableConcept> getReason();
	void setReason(java.util.List<fhir.CodeableConcept> reason);

	@Description("An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.")
	@Mandatory
	fhir.CodeableConcept getActivity();
	void setActivity(fhir.CodeableConcept activity);
	@Description("An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.")
	
	java.util.List<fhir.ProvenanceAgent> getAgent();
	void setAgent(java.util.List<fhir.ProvenanceAgent> agent);

	@Description("An entity used in this activity.")
	
	java.util.List<fhir.ProvenanceEntity> getEntity();
	void setEntity(java.util.List<fhir.ProvenanceEntity> entity);

	@Description("A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.")
	
	java.util.List<fhir.Signature> getSignature();
	void setSignature(java.util.List<fhir.Signature> signature);

}
