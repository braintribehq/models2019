/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImplementationGuidePage of the Data Model fhir.
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
{@link nameReference}, 
{@link page}, 

* It provides of then following operations (getters and setters)
{@link getNameReference},
{@link getPage},
{@link setNameReference},
{@link setPage},
 */

@Description("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")

public interface ImplementationGuidePage extends GenericEntity, fhir.BackboneElement {

	EntityType<ImplementationGuidePage> T = EntityTypes.T(ImplementationGuidePage.class);

	/* Constants for each property name. */
	java.lang.String nameReference = "nameReference";
	java.lang.String page = "page";

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getNameReference();
	void setNameReference(com.braintribe.model.generic.GenericEntity nameReference);
	@Description("Nested Pages/Sections under this page.")
	
	java.util.List<fhir.ImplementationGuidePage> getPage();
	void setPage(java.util.List<fhir.ImplementationGuidePage> page);

}
