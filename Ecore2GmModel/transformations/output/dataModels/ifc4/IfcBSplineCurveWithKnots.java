/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBSplineCurveWithKnots of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link KnotMultiplicities}, 
{@link Knots}, 
{@link KnotsAsString}, 
{@link KnotSpec}, 
{@link UpperIndexOnKnots}, 

* It provides of then following operations (getters and setters)
{@link getKnotMultiplicities},
{@link getKnots},
{@link getKnotsAsString},
{@link getKnotSpec},
{@link getUpperIndexOnKnots},
{@link setKnotMultiplicities},
{@link setKnots},
{@link setKnotsAsString},
{@link setKnotSpec},
{@link setUpperIndexOnKnots},
 */

@Description("")

public interface IfcBSplineCurveWithKnots extends GenericEntity, ifc4.IfcBSplineCurve {

	EntityType<IfcBSplineCurveWithKnots> T = EntityTypes.T(IfcBSplineCurveWithKnots.class);

	/* Constants for each property name. */
	java.lang.String KnotMultiplicities = "KnotMultiplicities";
	java.lang.String Knots = "Knots";
	java.lang.String KnotsAsString = "KnotsAsString";
	java.lang.String KnotSpec = "KnotSpec";
	java.lang.String UpperIndexOnKnots = "UpperIndexOnKnots";

	@Description("")
	
	java.util.List<java.lang.Long> getKnotMultiplicities();
	void setKnotMultiplicities(java.util.List<java.lang.Long> KnotMultiplicities);

	@Description("")
	
	java.util.List<java.lang.Double> getKnots();
	void setKnots(java.util.List<java.lang.Double> Knots);

	@Description("")
	
	java.util.List<java.lang.String> getKnotsAsString();
	void setKnotsAsString(java.util.List<java.lang.String> KnotsAsString);

	@Description("")
	@Mandatory
	ifc4.IfcKnotType getKnotSpec();
	void setKnotSpec(ifc4.IfcKnotType KnotSpec);
	@Description("")
	@Mandatory
	java.lang.Long getUpperIndexOnKnots();
	void setUpperIndexOnKnots(java.lang.Long UpperIndexOnKnots);
}
