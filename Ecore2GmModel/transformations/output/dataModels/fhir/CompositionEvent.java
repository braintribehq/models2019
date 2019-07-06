/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CompositionEvent of the Data Model fhir.
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
{@link code}, 
{@link period}, 
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getPeriod},
{@link getDetail},
{@link setCode},
{@link setPeriod},
{@link setDetail},
 */

@Description("A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).")

public interface CompositionEvent extends GenericEntity, fhir.BackboneElement {

	EntityType<CompositionEvent> T = EntityTypes.T(CompositionEvent.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String period = "period";
	java.lang.String detail = "detail";

	@Description("This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a 'History and Physical Report' in which the procedure being documented is necessarily a 'History and Physical' act.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDetail();
	void setDetail(java.util.List<com.braintribe.model.generic.GenericEntity> detail);

}
