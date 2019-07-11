/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBSplineSurfaceWithKnots of the Data Model iai.
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
{@link UMultiplicities}, 
{@link VMultiplicities}, 
{@link UKnots}, 
{@link UKnotsAsString}, 
{@link VKnots}, 
{@link VKnotsAsString}, 
{@link KnotSpec}, 
{@link KnotVUpper}, 
{@link KnotUUpper}, 

* It provides of then following operations (getters and setters)
{@link getUMultiplicities},
{@link getVMultiplicities},
{@link getUKnots},
{@link getUKnotsAsString},
{@link getVKnots},
{@link getVKnotsAsString},
{@link getKnotSpec},
{@link getKnotVUpper},
{@link getKnotUUpper},
{@link setUMultiplicities},
{@link setVMultiplicities},
{@link setUKnots},
{@link setUKnotsAsString},
{@link setVKnots},
{@link setVKnotsAsString},
{@link setKnotSpec},
{@link setKnotVUpper},
{@link setKnotUUpper},
 */

@Description("")

public interface IfcBSplineSurfaceWithKnots extends GenericEntity, ifc4.IfcBSplineSurface {

	EntityType<IfcBSplineSurfaceWithKnots> T = EntityTypes.T(IfcBSplineSurfaceWithKnots.class);

	/* Constants for each property name. */
	java.lang.String UMultiplicities = "UMultiplicities";
	java.lang.String VMultiplicities = "VMultiplicities";
	java.lang.String UKnots = "UKnots";
	java.lang.String UKnotsAsString = "UKnotsAsString";
	java.lang.String VKnots = "VKnots";
	java.lang.String VKnotsAsString = "VKnotsAsString";
	java.lang.String KnotSpec = "KnotSpec";
	java.lang.String KnotVUpper = "KnotVUpper";
	java.lang.String KnotUUpper = "KnotUUpper";

	@Description("")
	
	java.util.List<java.lang.Long> getUMultiplicities();
	void setUMultiplicities(java.util.List<java.lang.Long> UMultiplicities);

	@Description("")
	
	java.util.List<java.lang.Long> getVMultiplicities();
	void setVMultiplicities(java.util.List<java.lang.Long> VMultiplicities);

	@Description("")
	
	java.util.List<java.lang.Double> getUKnots();
	void setUKnots(java.util.List<java.lang.Double> UKnots);

	@Description("")
	
	java.util.List<java.lang.String> getUKnotsAsString();
	void setUKnotsAsString(java.util.List<java.lang.String> UKnotsAsString);

	@Description("")
	
	java.util.List<java.lang.Double> getVKnots();
	void setVKnots(java.util.List<java.lang.Double> VKnots);

	@Description("")
	
	java.util.List<java.lang.String> getVKnotsAsString();
	void setVKnotsAsString(java.util.List<java.lang.String> VKnotsAsString);

	@Description("")
	@Mandatory
	ifc4.IfcKnotType getKnotSpec();
	void setKnotSpec(ifc4.IfcKnotType KnotSpec);
	@Description("")
	@Mandatory
	java.lang.Long getKnotVUpper();
	void setKnotVUpper(java.lang.Long KnotVUpper);
	@Description("")
	@Mandatory
	java.lang.Long getKnotUUpper();
	void setKnotUUpper(java.lang.Long KnotUUpper);
}
