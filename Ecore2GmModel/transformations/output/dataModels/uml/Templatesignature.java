/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Templatesignature of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link parameter}, 
{@link template}, 
{@link ownedParameter}, 

* It provides of then following operations (getters and setters)
{@link getParameter},
{@link getTemplate},
{@link getOwnedParameter},
{@link setParameter},
{@link setTemplate},
{@link setOwnedParameter},
 */

@Description("A Template Signature bundles the set of formal TemplateParameters for a template.<p>From package UML::CommonStructure.</p>")

public interface Templatesignature extends GenericEntity, uml.Element {

	EntityType<Templatesignature> T = EntityTypes.T(Templatesignature.class);

	/* Constants for each property name. */
	java.lang.String parameter = "parameter";
	java.lang.String template = "template";
	java.lang.String ownedParameter = "ownedParameter";

	@Description("The ordered set of all formal TemplateParameters for this TemplateSignature.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Templateparameter> getParameter();
	void setParameter(java.util.List<uml.Templateparameter> parameter);

	@Description("The TemplateableElement that owns this TemplateSignature.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templateableelement getTemplate();
	void setTemplate(uml.Templateableelement template);
	@Description("The formal parameters that are owned by this TemplateSignature.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Templateparameter> getOwnedParameter();
	void setOwnedParameter(java.util.List<uml.Templateparameter> ownedParameter);

}
