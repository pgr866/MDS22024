import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-mostrarvaloracionnoticia')
export class VistaMostrarvaloracionnoticia extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%; flex-shrink: 0; justify-content: space-between;" id="Layoutmegustanomegustamostrarvaloracionnoticia">
  <vaadin-button style="height: 100%; flex-shrink: 0; flex-grow: 0; background-color: #FFFFFF; width: 20%; align-self: center;" id="Megustamostrarvaloracionnoticia">
   <img style="height: 100%; width: 100%;" src="https://i.postimg.cc/fk4fQzwZ/mg.png" id="Imagenmegustamostrarvaloracionnoticia">
  </vaadin-button>
  <label style="width: 20%; font-size: 110%; align-self: center; text-align: center;" id="Numeromegustamostrarvaloracionnoticia">0</label>
  <vaadin-button style="height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF; width: 20%;" id="Nomegustamostrarvaloracionnoticia">
   <img style="height: 100%; width: 100%;" src="https://i.postimg.cc/FFftvT9n/nmg.png" id="Imagennomegustamostrarvaloracionnoticia">
  </vaadin-button>
  <label style="width: 20%; font-size: 110%; text-align: center; align-self: center;" id="Numeronomegustamostrarvaloracionnoticia">0</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
