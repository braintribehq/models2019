/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Templateparametersubstitution of the Data Model uml.
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
{@link actual}, 
{@link formal}, 
{@link ownedActual}, 
{@link templateBinding}, 

* It provides of then following operations (getters and setters)
{@link getActual},
{@link getFormal},
{@link getOwnedActual},
{@link getTemplateBinding},
{@link setActual},
{@link setFormal},
{@link setOwnedActual},
{@link setTemplateBinding},
 */

@Description("A TemplateParameterSubstitution relates the actual parameter to a formal TemplateParameter as part of a template binding.<p>From package UML::CommonStructure.</p>")

public interface Templateparametersubstitution extends GenericEntity, uml.Element {

	EntityType<Templateparametersubstitution> T = EntityTypes.T(Templateparametersubstitution.class);

	/* Constants for each property name. */
	java.lang.String actual = "actual";
	java.lang.String formal = "formal";
	java.lang.String ownedActual = "ownedActual";
	java.lang.String templateBinding = "templateBinding";

	@Description("The ParameterableElement that is the actual parameter for this TemplateParameterSubstitution.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Parameterableelement getActual();
	void setActual(uml.Parameterableelement actual);
	@Description("The formal TemplateParameter that is associated with this TemplateParameterSubstitution.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templateparameter getFormal();
	void setFormal(uml.Templateparameter formal);
	@Description("The ParameterableElement that is owned by this TemplateParameterSubstitution as its actual parameter.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Parameterableelement getOwnedActual();
	void setOwnedActual(uml.Parameterableelement ownedActual);
	@Description("The TemplateBinding that owns this TemplateParameterSubstitution.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templatebinding getTemplateBinding();
	void setTemplateBinding(uml.Templatebinding templateBinding);
}
