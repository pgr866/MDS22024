import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-mostrarvaloracioncomentario')
export class VistaMostrarvaloracioncomentario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: flex-start; align-items: stretch;">
 <vaadin-horizontal-layout id="Layoutmegustamostrarvaloracioncomentario" style="justify-content: space-between;">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF; width: 40%; height: 100%;" id="Megustaseccioncomentariositem">
   <img style="width: 100%; height: 100%;" src="https://i.postimg.cc/fk4fQzwZ/mg.png" id="Imagenmegustaseccioncomentariositem">
  </vaadin-button>
  <label style="width: 50%; flex-shrink: 1; align-self: center;" id="Numeromegustamostrarvaloracioncomentario">0</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="Layoutnomegustamostrarvaloracioncomentario" style="justify-content: space-between;">
  <vaadin-button style="width: 40%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF; height: 100%;" id="Nomegustaseccioncomentariositem">
   <img style="width: 100%; height: 100%;" src="https://i.postimg.cc/FFftvT9n/nmg.png" id="Imagennomegustaseccioncomentariositem">
  </vaadin-button>
  <label style="width: 50%; flex-shrink: 0; align-self: center;" id="Numeronomegustamostrarvaloracioncomentario">0</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
