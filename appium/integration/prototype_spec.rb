require File.expand_path('spec_helper')

describe 'When we open our sample app' do
  #describe 'Tap track event' do
    #before do
      #scroll_to('Track event')
    #end

  it 'should be able to tap on  Track event' do
    list_el = text('Track event')
    list_el.click
    back
    list_el.click
    back
    list_el.click
    back
    list_el.click
  end



end