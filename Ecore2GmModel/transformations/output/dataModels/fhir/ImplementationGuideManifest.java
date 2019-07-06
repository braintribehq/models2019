/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImplementationGuideManifest of the Data Model fhir.
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
{@link resource}, 
{@link page}, 

* It provides of then following operations (getters and setters)
{@link getResource},
{@link getPage},
{@link setResource},
{@link setPage},
 */

@Description("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")

public interface ImplementationGuideManifest extends GenericEntity, fhir.BackboneElement {

	EntityType<ImplementationGuideManifest> T = EntityTypes.T(ImplementationGuideManifest.class);

	/* Constants for each property name. */
	java.lang.String resource = "resource";
	java.lang.String page = "page";

	@Description("A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
	
	java.util.List<fhir.FhirImplementationGuideResource1> getResource();
	void setResource(java.util.List<fhir.FhirImplementationGuideResource1> resource);

	@Description("Information about a page within the IG.")
	
	java.util.List<fhir.ImplementationGuidePage1> getPage();
	void setPage(java.util.List<fhir.ImplementationGuidePage1> page);

}
