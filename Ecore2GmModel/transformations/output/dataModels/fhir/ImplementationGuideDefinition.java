/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImplementationGuideDefinition of the Data Model fhir.
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
{@link grouping}, 
{@link resource}, 
{@link page}, 
{@link parameter}, 
{@link template}, 

* It provides of then following operations (getters and setters)
{@link getGrouping},
{@link getResource},
{@link getPage},
{@link getParameter},
{@link getTemplate},
{@link setGrouping},
{@link setResource},
{@link setPage},
{@link setParameter},
{@link setTemplate},
 */

@Description("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")

public interface ImplementationGuideDefinition extends GenericEntity, fhir.BackboneElement {

	EntityType<ImplementationGuideDefinition> T = EntityTypes.T(ImplementationGuideDefinition.class);

	/* Constants for each property name. */
	java.lang.String grouping = "grouping";
	java.lang.String resource = "resource";
	java.lang.String page = "page";
	java.lang.String parameter = "parameter";
	java.lang.String template = "template";

	@Description("A logical group of resources. Logical groups can be used when building pages.")
	
	java.util.List<fhir.ImplementationGuideGrouping> getGrouping();
	void setGrouping(java.util.List<fhir.ImplementationGuideGrouping> grouping);

	@Description("A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
	
	java.util.List<fhir.FhirImplementationGuideResource> getResource();
	void setResource(java.util.List<fhir.FhirImplementationGuideResource> resource);

	@Description("A page / section in the implementation guide. The root page is the implementation guide home page.")
	@Mandatory
	fhir.ImplementationGuidePage getPage();
	void setPage(fhir.ImplementationGuidePage page);
	@Description("Defines how IG is built by tools.")
	
	java.util.List<fhir.ImplementationGuideParameter> getParameter();
	void setParameter(java.util.List<fhir.ImplementationGuideParameter> parameter);

	@Description("A template for building resources.")
	
	java.util.List<fhir.ImplementationGuideTemplate> getTemplate();
	void setTemplate(java.util.List<fhir.ImplementationGuideTemplate> template);

}
