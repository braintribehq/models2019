/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Readlinkobjectendaction of the Data Model uml.
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
{@link end}, 
{@link object}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getEnd},
{@link getObject},
{@link getResult},
{@link setEnd},
{@link setObject},
{@link setResult},
 */

@Description("A ReadLinkObjectEndAction is an Action that retrieves an end object from a link object.<p>From package UML::Actions.</p>")

public interface Readlinkobjectendaction extends GenericEntity, uml.Action {

	EntityType<Readlinkobjectendaction> T = EntityTypes.T(Readlinkobjectendaction.class);

	/* Constants for each property name. */
	java.lang.String end = "end";
	java.lang.String object = "object";
	java.lang.String result = "result";

	@Description("The Association end to be read.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Property getEnd();
	void setEnd(uml.Property end);
	@Description("The input pin from which the link object is obtained.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
	@Description("The OutputPin where the result value is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
