/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DocumentReferenceContext of the Data Model fhir.
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
{@link encounter}, 
{@link event}, 
{@link period}, 
{@link facilityType}, 
{@link practiceSetting}, 
{@link sourcePatientInfo}, 
{@link related}, 

* It provides of then following operations (getters and setters)
{@link getEncounter},
{@link getEvent},
{@link getPeriod},
{@link getFacilityType},
{@link getPracticeSetting},
{@link getSourcePatientInfo},
{@link getRelated},
{@link setEncounter},
{@link setEvent},
{@link setPeriod},
{@link setFacilityType},
{@link setPracticeSetting},
{@link setSourcePatientInfo},
{@link setRelated},
 */

@Description("A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.")

public interface DocumentReferenceContext extends GenericEntity, fhir.BackboneElement {

	EntityType<DocumentReferenceContext> T = EntityTypes.T(DocumentReferenceContext.class);

	/* Constants for each property name. */
	java.lang.String encounter = "encounter";
	java.lang.String event = "event";
	java.lang.String period = "period";
	java.lang.String facilityType = "facilityType";
	java.lang.String practiceSetting = "practiceSetting";
	java.lang.String sourcePatientInfo = "sourcePatientInfo";
	java.lang.String related = "related";

	@Description("Describes the clinical encounter or type of care that the document content is associated with.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEncounter();
	void setEncounter(java.util.List<com.braintribe.model.generic.GenericEntity> encounter);

	@Description("This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the type Code, such as a 'History and Physical Report' in which the procedure being documented is necessarily a 'History and Physical' act.")
	
	java.util.List<fhir.CodeableConcept> getEvent();
	void setEvent(java.util.List<fhir.CodeableConcept> event);

	@Description("The time period over which the service that is described by the document was provided.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The kind of facility where the patient was seen.")
	@Mandatory
	fhir.CodeableConcept getFacilityType();
	void setFacilityType(fhir.CodeableConcept facilityType);
	@Description("This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.")
	@Mandatory
	fhir.CodeableConcept getPracticeSetting();
	void setPracticeSetting(fhir.CodeableConcept practiceSetting);
	@Description("The Patient Information as known when the document was published. May be a reference to a version specific, or contained.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSourcePatientInfo();
	void setSourcePatientInfo(com.braintribe.model.generic.GenericEntity sourcePatientInfo);
	@Description("Related identifiers or resources associated with the DocumentReference.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRelated();
	void setRelated(java.util.List<com.braintribe.model.generic.GenericEntity> related);

}
