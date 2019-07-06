/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Syntax of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link possibleEncodings}, 
{@link generatedFor}, 

* It provides of then following operations (getters and setters)
{@link getPossibleEncodings},
{@link getGeneratedFor},
{@link setPossibleEncodings},
{@link setGeneratedFor},
 */

@Description("a particular syntax for a MessageInstance")

public interface Syntax extends GenericEntity, iso20022.ModelEntity {

	EntityType<Syntax> T = EntityTypes.T(Syntax.class);

	/* Constants for each property name. */
	java.lang.String possibleEncodings = "possibleEncodings";
	java.lang.String generatedFor = "generatedFor";

	@Description("the set of possible encodings for a given Syntax")
	
	java.util.List<iso20022.Encoding> getPossibleEncodings();
	void setPossibleEncodings(java.util.List<iso20022.Encoding> possibleEncodings);

	@Description("the scheme in which a syntax is encoded")
	
	java.util.List<iso20022.MessageSet> getGeneratedFor();
	void setGeneratedFor(java.util.List<iso20022.MessageSet> generatedFor);

}
