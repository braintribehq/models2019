/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type FhirDomainResource of the Data Model fhir.
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
{@link text}, 
{@link contained}, 

* It provides of then following operations (getters and setters)
{@link getText},
{@link getContained},
{@link setText},
{@link setContained},
 */

@Description("A resource that includes narrative, extensions, and contained resources.")

public interface FhirDomainResource extends GenericEntity, fhir.FhirResource {

	EntityType<FhirDomainResource> T = EntityTypes.T(FhirDomainResource.class);

	/* Constants for each property name. */
	java.lang.String text = "text";
	java.lang.String contained = "contained";

	@Description("A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it 'clinically safe' for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.")
	@Mandatory
	fhir.Narrative getText();
	void setText(fhir.Narrative text);
	@Description("These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.")
	
	java.util.List<fhir.FhirResourceContainer> getContained();
	void setContained(java.util.List<fhir.FhirResourceContainer> contained);

}
