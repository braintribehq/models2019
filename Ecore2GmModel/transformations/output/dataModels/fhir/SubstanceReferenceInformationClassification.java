/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceReferenceInformationClassification of the Data Model fhir.
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
{@link domain}, 
{@link classification}, 
{@link subtype}, 
{@link source}, 

* It provides of then following operations (getters and setters)
{@link getDomain},
{@link getClassification},
{@link getSubtype},
{@link getSource},
{@link setDomain},
{@link setClassification},
{@link setSubtype},
{@link setSource},
 */

@Description("Todo.")

public interface SubstanceReferenceInformationClassification extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceReferenceInformationClassification> T = EntityTypes.T(SubstanceReferenceInformationClassification.class);

	/* Constants for each property name. */
	java.lang.String domain = "domain";
	java.lang.String classification = "classification";
	java.lang.String subtype = "subtype";
	java.lang.String source = "source";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getDomain();
	void setDomain(fhir.CodeableConcept domain);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getClassification();
	void setClassification(fhir.CodeableConcept classification);
	@Description("Todo.")
	
	java.util.List<fhir.CodeableConcept> getSubtype();
	void setSubtype(java.util.List<fhir.CodeableConcept> subtype);

	@Description("Todo.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

}
