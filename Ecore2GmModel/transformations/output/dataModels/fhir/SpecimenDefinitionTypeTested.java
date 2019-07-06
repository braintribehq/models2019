/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenDefinitionTypeTested of the Data Model fhir.
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
{@link container}, 
{@link retentionTime}, 
{@link rejectionCriterion}, 
{@link handling}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getContainer},
{@link getRetentionTime},
{@link getRejectionCriterion},
{@link getHandling},
{@link setType},
{@link setContainer},
{@link setRetentionTime},
{@link setRejectionCriterion},
{@link setHandling},
 */

@Description("A kind of specimen with associated set of requirements.")

public interface SpecimenDefinitionTypeTested extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenDefinitionTypeTested> T = EntityTypes.T(SpecimenDefinitionTypeTested.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String container = "container";
	java.lang.String retentionTime = "retentionTime";
	java.lang.String rejectionCriterion = "rejectionCriterion";
	java.lang.String handling = "handling";

	@Description("The kind of specimen conditioned for testing expected by lab.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The specimen's container.")
	@Mandatory
	fhir.SpecimenDefinitionContainer getContainer();
	void setContainer(fhir.SpecimenDefinitionContainer container);
	@Description("The usual time that a specimen of this kind is retained after the ordered tests are completed, for the purpose of additional testing.")
	@Mandatory
	fhir.Duration getRetentionTime();
	void setRetentionTime(fhir.Duration retentionTime);
	@Description("Criterion for rejection of the specimen in its container by the laboratory.")
	
	java.util.List<fhir.CodeableConcept> getRejectionCriterion();
	void setRejectionCriterion(java.util.List<fhir.CodeableConcept> rejectionCriterion);

	@Description("Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.")
	
	java.util.List<fhir.SpecimenDefinitionHandling> getHandling();
	void setHandling(java.util.List<fhir.SpecimenDefinitionHandling> handling);

}
