/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceReferenceInformation of the Data Model fhir.
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
{@link gene}, 
{@link geneElement}, 
{@link classification}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getGene},
{@link getGeneElement},
{@link getClassification},
{@link getTarget},
{@link setGene},
{@link setGeneElement},
{@link setClassification},
{@link setTarget},
 */

@Description("Todo.If the element is present, it must have either a @value, an @id, or extensions")

public interface SubstanceReferenceInformation extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SubstanceReferenceInformation> T = EntityTypes.T(SubstanceReferenceInformation.class);

	/* Constants for each property name. */
	java.lang.String gene = "gene";
	java.lang.String geneElement = "geneElement";
	java.lang.String classification = "classification";
	java.lang.String target = "target";

	@Description("Todo.")
	
	java.util.List<fhir.SubstanceReferenceInformationGene> getGene();
	void setGene(java.util.List<fhir.SubstanceReferenceInformationGene> gene);

	@Description("Todo.")
	
	java.util.List<fhir.SubstanceReferenceInformationGeneElement> getGeneElement();
	void setGeneElement(java.util.List<fhir.SubstanceReferenceInformationGeneElement> geneElement);

	@Description("Todo.")
	
	java.util.List<fhir.SubstanceReferenceInformationClassification> getClassification();
	void setClassification(java.util.List<fhir.SubstanceReferenceInformationClassification> classification);

	@Description("Todo.")
	
	java.util.List<fhir.SubstanceReferenceInformationTarget> getTarget();
	void setTarget(java.util.List<fhir.SubstanceReferenceInformationTarget> target);

}
