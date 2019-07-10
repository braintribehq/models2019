/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Reduceaction of the Data Model uml.
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
{@link collection}, 
{@link isOrdered}, 
{@link reducer}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getCollection},
{@link getIsOrdered},
{@link getReducer},
{@link getResult},
{@link setCollection},
{@link setIsOrdered},
{@link setReducer},
{@link setResult},
 */

@Description("A ReduceAction is an Action that reduces a collection to a single value by repeatedly combining the elements of the collection using a reducer Behavior.<p>From package UML::Actions.</p>")

public interface Reduceaction extends GenericEntity, uml.Action {

	EntityType<Reduceaction> T = EntityTypes.T(Reduceaction.class);

	/* Constants for each property name. */
	java.lang.String collection = "collection";
	java.lang.String isOrdered = "isOrdered";
	java.lang.String reducer = "reducer";
	java.lang.String result = "result";

	@Description("The InputPin that provides the collection to be reduced.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getCollection();
	void setCollection(uml.Inputpin collection);
	@Description("Indicates whether the order of the input collection should determine the order in which the reducer Behavior is applied to its elements.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsOrdered();
	void setIsOrdered(types.Boolean isOrdered);
	@Description("A Behavior that is repreatedly applied to two elements of the input collection to produce a value that is of the same type as elements of the collection.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Behavior getReducer();
	void setReducer(uml.Behavior reducer);
	@Description("The output pin on which the result value is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
}
