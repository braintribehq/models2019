/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Multiplicityelement of the Data Model uml.
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
{@link isOrdered}, 
{@link isUnique}, 
{@link lower}, 
{@link lowerValue}, 
{@link upper}, 
{@link upperValue}, 

* It provides of then following operations (getters and setters)
{@link getIsOrdered},
{@link getIsUnique},
{@link getLower},
{@link getLowerValue},
{@link getUpper},
{@link getUpperValue},
{@link setIsOrdered},
{@link setIsUnique},
{@link setLower},
{@link setLowerValue},
{@link setUpper},
{@link setUpperValue},
 */

@Description("A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A MultiplicityElement embeds this information to specify the allowable cardinalities for an instantiation of the Element.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Multiplicityelement extends GenericEntity, uml.Element {

	EntityType<Multiplicityelement> T = EntityTypes.T(Multiplicityelement.class);

	/* Constants for each property name. */
	java.lang.String isOrdered = "isOrdered";
	java.lang.String isUnique = "isUnique";
	java.lang.String lower = "lower";
	java.lang.String lowerValue = "lowerValue";
	java.lang.String upper = "upper";
	java.lang.String upperValue = "upperValue";

	@Description("For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this MultiplicityElement are sequentially ordered.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.Boolean getIsOrdered();
	void setIsOrdered(types.Boolean isOrdered);
	@Description("For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this MultiplicityElement are unique.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.Boolean getIsUnique();
	void setIsUnique(types.Boolean isUnique);
	@Description("The lower bound of the multiplicity interval.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.Integer getLower();
	void setLower(types.Integer lower);
	@Description("The specification of the lower bound for this multiplicity.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Valuespecification getLowerValue();
	void setLowerValue(uml.Valuespecification lowerValue);
	@Description("The upper bound of the multiplicity interval.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.UnlimitedNatural getUpper();
	void setUpper(types.UnlimitedNatural upper);
	@Description("The specification of the upper bound for this multiplicity.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Valuespecification getUpperValue();
	void setUpperValue(uml.Valuespecification upperValue);
}
