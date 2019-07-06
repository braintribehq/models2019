/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceReferenceInformationGene of the Data Model fhir.
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
{@link geneSequenceOrigin}, 
{@link gene}, 
{@link source}, 

* It provides of then following operations (getters and setters)
{@link getGeneSequenceOrigin},
{@link getGene},
{@link getSource},
{@link setGeneSequenceOrigin},
{@link setGene},
{@link setSource},
 */

@Description("Todo.")

public interface SubstanceReferenceInformationGene extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceReferenceInformationGene> T = EntityTypes.T(SubstanceReferenceInformationGene.class);

	/* Constants for each property name. */
	java.lang.String geneSequenceOrigin = "geneSequenceOrigin";
	java.lang.String gene = "gene";
	java.lang.String source = "source";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getGeneSequenceOrigin();
	void setGeneSequenceOrigin(fhir.CodeableConcept geneSequenceOrigin);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getGene();
	void setGene(fhir.CodeableConcept gene);
	@Description("Todo.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

}
