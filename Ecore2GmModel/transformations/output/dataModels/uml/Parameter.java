/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Parameter of the Data Model uml.
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
{@link default_}, 
{@link defaultValue}, 
{@link direction}, 
{@link effect}, 
{@link isException}, 
{@link isStream}, 
{@link operation}, 
{@link parameterSet}, 

* It provides of then following operations (getters and setters)
{@link getDefault_},
{@link getDefaultValue},
{@link getDirection},
{@link getEffect},
{@link getIsException},
{@link getIsStream},
{@link getOperation},
{@link getParameterSet},
{@link setDefault_},
{@link setDefaultValue},
{@link setDirection},
{@link setEffect},
{@link setIsException},
{@link setIsStream},
{@link setOperation},
{@link setParameterSet},
 */

@Description("A Parameter is a specification of an argument used to pass information into or out of an invocation of a BehavioralFeature.  Parameters can be treated as ConnectableElements within Collaborations.<p>From package UML::Classification.</p>")

public interface Parameter extends GenericEntity, uml.Connectableelement, uml.Multiplicityelement {

	EntityType<Parameter> T = EntityTypes.T(Parameter.class);

	/* Constants for each property name. */
	java.lang.String default_ = "default_";
	java.lang.String defaultValue = "defaultValue";
	java.lang.String direction = "direction";
	java.lang.String effect = "effect";
	java.lang.String isException = "isException";
	java.lang.String isStream = "isStream";
	java.lang.String operation = "operation";
	java.lang.String parameterSet = "parameterSet";

	@Description("A String that represents a value to be used when no argument is supplied for the Parameter.<p>From package UML::Classification.</p>")
	@Mandatory
	types.String getDefault_();
	void setDefault_(types.String default_);
	@Description("Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Valuespecification getDefaultValue();
	void setDefaultValue(uml.Valuespecification defaultValue);
	@Description("Indicates whether a parameter is being sent into or out of a behavioral element.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.ParameterDirectionKind getDirection();
	void setDirection(uml.ParameterDirectionKind direction);
	@Description("Specifies the effect that executions of the owner of the Parameter have on objects passed in or out of the parameter.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.ParameterEffectKind getEffect();
	void setEffect(uml.ParameterEffectKind effect);
	@Description("Tells whether an output parameter may emit a value to the exclusion of the other outputs.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsException();
	void setIsException(types.Boolean isException);
	@Description("Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter may post values while the behavior is executing.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsStream();
	void setIsStream(types.Boolean isStream);
	@Description("The Operation owning this parameter.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Operation getOperation();
	void setOperation(uml.Operation operation);
	@Description("The ParameterSets containing the parameter. See ParameterSet.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Parameterset> getParameterSet();
	void setParameterSet(java.util.List<uml.Parameterset> parameterSet);

}
