/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CodeSet of the Data Model iso20022.
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
{@link trace}, 
{@link derivation}, 
{@link identificationScheme}, 
{@link code}, 

* It provides of then following operations (getters and setters)
{@link getTrace},
{@link getDerivation},
{@link getIdentificationScheme},
{@link getCode},
{@link setTrace},
{@link setDerivation},
{@link setIdentificationScheme},
{@link setCode},
 */

@Description("Set of Codes grouped together to characterize all the values of an attribute.")

public interface CodeSet extends GenericEntity, iso20022.String {

	EntityType<CodeSet> T = EntityTypes.T(CodeSet.class);

	/* Constants for each property name. */
	java.lang.String trace = "trace";
	java.lang.String derivation = "derivation";
	java.lang.String identificationScheme = "identificationScheme";
	java.lang.String code = "code";

	@Description("The CodeSet that this CodesSet is derived from.")
	@Mandatory
	iso20022.CodeSet getTrace();
	void setTrace(iso20022.CodeSet trace);
	@Description("The CodeSets which are derived from this CodeSet.")
	
	java.util.List<iso20022.CodeSet> getDerivation();
	void setDerivation(java.util.List<iso20022.CodeSet> derivation);

	@Description("Uniquely identifies a set of Codes through a Uniform Resource Identifier (URI).")
	@Mandatory
	java.lang.String getIdentificationScheme();
	void setIdentificationScheme(java.lang.String identificationScheme);
	@Description("A set of Codes belonging to the same CodeSet")
	
	java.util.List<iso20022.Code> getCode();
	void setCode(java.util.List<iso20022.Code> code);

}
