/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Readlinkobjectendqualifieraction of the Data Model uml.
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
{@link object}, 
{@link qualifier}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getObject},
{@link getQualifier},
{@link getResult},
{@link setObject},
{@link setQualifier},
{@link setResult},
 */

@Description("A ReadLinkObjectEndQualifierAction is an Action that retrieves a qualifier end value from a link object.<p>From package UML::Actions.</p>")

public interface Readlinkobjectendqualifieraction extends GenericEntity, uml.Action {

	EntityType<Readlinkobjectendqualifieraction> T = EntityTypes.T(Readlinkobjectendqualifieraction.class);

	/* Constants for each property name. */
	java.lang.String object = "object";
	java.lang.String qualifier = "qualifier";
	java.lang.String result = "result";

	@Description("The InputPin from which the link object is obtained.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
	@Description("The qualifier Property to be read.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Property getQualifier();
	void setQualifier(uml.Property qualifier);
	@Description("The OutputPin where the result value is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
