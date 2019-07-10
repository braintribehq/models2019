/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Templateableelement of the Data Model uml.
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
{@link templateBinding}, 
{@link ownedTemplateSignature}, 

* It provides of then following operations (getters and setters)
{@link getTemplateBinding},
{@link getOwnedTemplateSignature},
{@link setTemplateBinding},
{@link setOwnedTemplateSignature},
 */

@Description("A TemplateableElement is an Element that can optionally be defined as a template and bound to other templates.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Templateableelement extends GenericEntity, uml.Element {

	EntityType<Templateableelement> T = EntityTypes.T(Templateableelement.class);

	/* Constants for each property name. */
	java.lang.String templateBinding = "templateBinding";
	java.lang.String ownedTemplateSignature = "ownedTemplateSignature";

	@Description("The optional TemplateBindings from this TemplateableElement to one or more templates.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Templatebinding> getTemplateBinding();
	void setTemplateBinding(java.util.List<uml.Templatebinding> templateBinding);

	@Description("The optional TemplateSignature specifying the formal TemplateParameters for this TemplateableElement. If a TemplateableElement has a TemplateSignature, then it is a template.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templatesignature getOwnedTemplateSignature();
	void setOwnedTemplateSignature(uml.Templatesignature ownedTemplateSignature);
}
